package lanSimulation.internals;

public class Printer extends Node{
	public Printer(String name) {
		super(name);
	}
	
	public Printer(String name, Node nextNode){
		super(name,nextNode);
	}

		@Override
	public void writeBuf(StringBuffer buf, String[] text){
		buf.append(text[4]);
		buf.append(this.name_);
		buf.append(text[5]);
	}
}