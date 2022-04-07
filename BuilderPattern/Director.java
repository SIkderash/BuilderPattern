public class Director {
    PCBuilder builder;
    public void setBuilder(PCBuilder builder){
        this.builder = builder;
    }
    public Pc makePC(){
        return builder.buildPC();
    }
}
