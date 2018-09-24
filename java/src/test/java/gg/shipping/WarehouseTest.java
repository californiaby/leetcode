package gg.shipping;

import org.junit.Test;

import java.util.HashSet;

public class WarehouseTest {

  @Test
  public void test() {
    Warehouse wh1 = new Warehouse(1);
    Warehouse wh2 = new Warehouse(2);
    DistributionCenter dc1 = new DistributionCenter(1);
    DistributionCenter dc2 = new DistributionCenter(2);
    DistributionCenter dc3 = new DistributionCenter(3);
    DistributionCenter dc4 = new DistributionCenter(4);
    Neighborhood n1 = new Neighborhood(1);
    Neighborhood n2 = new Neighborhood(2);
    Neighborhood n3 = new Neighborhood(3);
    Neighborhood n4 = new Neighborhood(4);

    wh1.link(dc1);
    wh1.link(dc2);
    wh2.link(dc4);

    dc1.link(n1);
    dc2.link(n2);
    dc2.link(dc3);
    dc2.link(dc4);
    dc3.link(dc4);
    dc4.link(n3);
    dc4.link(n4);

    Warehouse wh3 = new Warehouse(3);
    Neighborhood n5 = new Neighborhood(5);
    wh3.link(n5);

    Warehouse wh4 = new Warehouse(4);
    DistributionCenter dc5 = new DistributionCenter(5);
    Neighborhood n6 = new Neighborhood(6);
    wh3.link(dc5);
    dc5.link(n6);

    HashSet<Warehouse> set = new HashSet<>();
    set.add(wh1);
    set.add(wh2);
    set.add(wh3);
    set.add(wh4);

    int count = LocUtils.countAccessibleNeighborhoods(set);

    System.out.println(count);

  }

}