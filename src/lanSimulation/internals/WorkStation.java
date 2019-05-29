package lanSimulation.internals;

public class WorkStation extends Node{
	
	public WorkStation(String name) {
		super(name);
	}
	
	public WorkStation(String name, Node nextNode){
		super(name,nextNode);
	}
	
	@Override
	public void writeBuf(StringBuffer buf, String[] text){
		buf.append(text[2]);
		buf.append(this.name_);
		buf.append(text[3]);
	}
}