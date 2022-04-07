public class GamingPCBuilder implements PCBuilder{
    Pc pc;
    public GamingPCBuilder(){
        this.pc = new Pc("Gaming PC");
    }

    @Override
    public void addProcessor(){
        Processor processor = new Ryzen();
        pc.addItem(processor);
    }
    public void addMotherBoard(){
        MotherBoard motherBoard = new GigaByte();
        pc.addItem(motherBoard);
    }
    public Pc buildPC(){
        addMotherBoard();
        addProcessor();
        return this.pc;
    }
}
