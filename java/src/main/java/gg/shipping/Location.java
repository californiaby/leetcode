package gg.shipping;

import java.util.HashSet;
import java.util.Set;

public class Location {
  String id;
  Set<Location> links;

  public Location(String prefix, int id) {
    if (prefix == null) prefix = "";
    this.id = prefix + id;
    this.links = new HashSet<>();
  }

  public void link(Location loc) {
    this.links.add(loc);
  }
}
