package JavaException2;

public class LeaveExceedLimitException extends RuntimeException
{
	public LeaveExceedLimitException(String msg)
	{
		super(msg);
	}
}
