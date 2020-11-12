import java.util.ArrayList;

public class Board {
  public ArrayList<ArrayList<Entity>> State;

  public Board(int w, int h) {
     State = new ArrayList<ArrayList<Entity>>(h);
     for (int r = 0; r < State.size(); r++) {
       State.add(new ArrayList<Entity>(h));
     }
  }

  void PrintBoard() {
    if (State.size() > 0) {
      if (State.get(0).size() > 0) {
        System.out.println("["+State.size()+"x"+State.get(0).size()+"]");
        for(int r = 0; r < State.size(); r++ ) {
          System.out.printf("|");
          for (int c = 0; c < State.get(r).size(); c++) {
            Entity e = State.get(r).get(c);
            if(e != null) {
              System.out.printf(e.Symbol()+"|");
            } else {
              System.out.printf(" |");
            }
          }
        }
      }
    }
  }

  int aToInt(char a) {
    String charset = "abcdefghujklmnopqrstuvwxyz";
    return charset.indexOf(a);
  }
}