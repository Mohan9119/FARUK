package Advanced_Enum_pack2;

public class Z6 
{
	public static void main(String[] args) {
		Thread.State states[]=Thread.State.values();
		for (int i=0; i<states.length; i++)
		{
			System.out.println(states[i]);
		}
	}
}
/*
inside a thread class there is a enum state.

inside a enum we are calling values method.

thread is a builtin class inside that bulit in enum
what ever constant values all values are returning to
array all are printing.

thread is under going this many states in life cycle:-
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
*/