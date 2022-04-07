import java.util.ArrayList;
import java.util.List;

public class Pc {
  private String type;
  private List<Components> items;

  public Pc(String type){
    this.type = type;
    this.items = new ArrayList<Components>();
  }

  public void addItem(Components components) {
    items.add(components);
  }

  public void getCost() {
    for (Components component : items) {
      component.price();
    }
  }

  public void showDetails() {
    System.out.println("PC type : " + this.type);
    for (Components component : items) {
      System.out.print("Component type : " + component.type());
      System.out.print(", Component name : " + component.name());
      System.out.println(", Price : " + component.price());
    }
    System.out.print("\n\n\n");
  }
}
