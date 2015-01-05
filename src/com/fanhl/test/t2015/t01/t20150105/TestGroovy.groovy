import com.fanhl.test.t2015.t01.t20150105.NodeList
import com.fanhl.test.t2015.t01.t20150105.Station

NodeList<Station> stations=[]

stations.with {
    add new Station('三元桥')
    add new Station('太阳宫')
    add new Station('芍药居')
    add new Station('惠新西街南口')
}

def station = stations[0]
while (station) {
    println station
    station = station.next
}