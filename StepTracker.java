public class StepTracker
{
    private int totalDays;
    private int activeDays;
    private int totalSteps;
    private int minStepsRequired;


    public StepTracker(int min)
    {
        minStepsRequired = min;
        totalDays = 0;
        activeDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps)
    {
        totalSteps += steps;
        totalDays++;

        if(totalSteps >= minStepsRequired)
        {
            activeDays++;
        }

    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        double average;
        average = (double) totalSteps / (double) totalDays;
        return average;
    }
}