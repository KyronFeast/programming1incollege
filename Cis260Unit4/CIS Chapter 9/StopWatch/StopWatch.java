
/*Stopwatch
 * Thomas J. Short
 * 11/20/2019
 * CIS 260
   */
class StopWatch 
{
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;


    public StopWatch() 
    {
    }

    public long getStartTime()
    {
        return this.startTime;
    }

    public long getEndTime() 
    {
        return this.endTime;
    }

    public void start() 
    {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() 
    {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() 
    {
        return this.endTime - this.startTime;
    }
}