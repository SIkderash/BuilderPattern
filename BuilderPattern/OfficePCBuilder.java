public class OfficePCBuilder implements PCBuilder{
    Pc pc;
    public OfficePCBuilder(){
        this.pc = new Pc("Office PC");
    }

    @Override
    public void addProcessor(){
        Processor processor = new Intel();
        pc.addItem(processor);
    }
    public void addMotherBoard(){
        MotherBoard motherBoard = new Esonic();
        pc.addItem(motherBoard);
    }
    public Pc buildPC(){
        addMotherBoard();
        addProcessor();
        return this.pc;
    }
}
