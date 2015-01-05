package com.fanhl.test.t2015.t01.t20150105;

/**
 * Created by fanhl on 15/1/5.
 */
public class Test {
    public static void main(String[] args) {
        NodeList<Station> stations = new NodeList<>();
        stations.add(new Station("三元桥"));
        stations.add(new Station("太阳宫"));
        stations.add(new Station("芍药居"));
        stations.add(new Station("惠新西街南口"));

        Station station = stations.get(0);
        while (station != null) {
            System.out.println(station);
            station = station.getNext();
        }
    }
}

class Station implements NodeList.Nodeable<Station> {
    String name;

    Station pre, next;

    public Station(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public Station getPre() {
        return null;
    }

    @Override
    public void setPre(Station station) {
        pre = station;
    }

    @Override
    public Station getNext() {
        return next;
    }

    @Override
    public void setNext(Station station) {
        next = station;
    }
}
