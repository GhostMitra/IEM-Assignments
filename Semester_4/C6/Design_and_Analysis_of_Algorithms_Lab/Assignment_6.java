import java.util.Scanner;
import static java.lang.System.out;
class JobSequenceResult 
{
    private int totalJobs;
    private double totalProfit;
    private long[] sequence;

    public JobSequenceResult(int totalJobs, double totalProfit, long[] sequence) 
    {
        this.totalJobs = totalJobs;
        this.totalProfit = totalProfit;
        this.sequence = sequence;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Total Jobs Done: ").append(totalJobs).append("\n");
        sb.append("Total Profit: ").append(totalProfit).append("\n");
        sb.append("Job Sequence: ");

        for (long id : sequence) 
        {
            if (id != -1)
                sb.append(id).append(" ");
        }
        return sb.toString();
    }
}

class Job {
    long id;
    int deadline;
    double profit;

    Job(long id, int deadline, double profit) 
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

class JobSequencer {
    private Job[] jobs;

    public JobSequencer(Job[] jobs) 
    {
        this.jobs = jobs;
    }

    /* Merge Sort (Descending by Profit) */
    private void mergeSort(int low, int high) 
    {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) 
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        Job[] left = new Job[n1];
        Job[] right = new Job[n2];

        for (int i = 0; i < n1; i++)
            left[i] = jobs[low + i];
        for (int j = 0; j < n2; j++)
            right[j] = jobs[mid + 1 + j];

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i].profit >= right[j].profit)  // Descending order
                jobs[k++] = left[i++];
            else
                jobs[k++] = right[j++];
        }

        while (i < n1)
            jobs[k++] = left[i++];

        while (j < n2)
            jobs[k++] = right[j++];
    }

    public JobSequenceResult process() 
    {
        mergeSort(0, jobs.length - 1);

        int maxDeadline = 0;
        for (Job job : jobs)
            maxDeadline = Math.max(maxDeadline, job.deadline);

        long[] slot = new long[maxDeadline];
        for (int i = 0; i < maxDeadline; i++)
            slot[i] = -1;

        int countJobs = 0;
        double totalProfit = 0;
        for (Job job : jobs) {
            for (int j = job.deadline - 1; j >= 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = job.id;
                    countJobs++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        return new JobSequenceResult(countJobs, totalProfit, slot);
    }
}

/* Driver class */
public class Assignment_6 {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();

        Job[] jobs = new Job[n];

        System.out.println("Enter Job ID, Deadline and Profit:");
        for (int i = 0; i < n; i++) 
        {
            long id = sc.nextLong();
            int deadline = sc.nextInt();
            double profit = sc.nextDouble();
            jobs[i] = new Job(id, deadline, profit);
        }

        JobSequencer obj = new JobSequencer(jobs);
        System.out.println(obj.process());

        sc.close();
    }
}