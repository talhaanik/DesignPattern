package book.headfirst.ch6.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
