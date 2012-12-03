
public class Pair {
  public Object key;
  public Object value;
  public Pair(Object o1, Object o2) { this.key = o1; this.value = o2; }
 
  public static boolean same(Object o1, Object o2) {
    return o1 == null ? o2 == null : o1.equals(o2);
  }
 
  Object getFirst() { return key; }
  Object getSecond() { return value; }
 
  void setFirst(Object o) { key = o; }
  void setSecond(Object o) { value = o; }
 
  public boolean equals(Object obj) {
    if( ! (obj instanceof Pair))
      return false;
    Pair p = (Pair)obj;
    return same(p.key, this.key) && same(p.value, this.value);
  }
 
  public String toString() {
    return "Pair{"+key+", "+value+"}";
  }
 
    /**
     * Simple example test program.
     */
    public static void main(String[] args) {
        Pair
            p1 = new Pair("a", "b"),
            p2 = new Pair("a", null),
            p3 = new Pair("a", "b"),
            p4 = new Pair(null, null);
        System.out.println(p1.equals(new Pair(new Integer(1), new Integer(2))) + " should be false");
        System.out.println(p4.equals(p2) + " should be false");
        System.out.println(p2.equals(p4) + " should be false");
        System.out.println(p1.equals(p3) + " should be true");
        System.out.println(p4.equals(p4) + " should be true");
    }
 
}
