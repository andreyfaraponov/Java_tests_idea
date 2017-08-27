import java.util.ArrayList;
import java.util.List;

public class Event_system_task
{
}

abstract class Event{
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	public void start()
	{
		eventTime = System.nanoTime() + delayTime;
	}
	public boolean ready(){
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();
}

class Controller{
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c){eventList.add(c);}
	public void run(){
		while(eventList.size() > 0)
		{
			for (Event e: new ArrayList<Event>(eventList))
			{
				if(e.ready())
				{
					System.out.println(e.toString());
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}