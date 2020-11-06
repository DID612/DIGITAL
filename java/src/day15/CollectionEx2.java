package day15;

import java.util.ArrayList;

public class CollectionEx2 {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(1,1));
		list.add(new Point(1,2));
		list.add(new Point(1,3));
		list.add(new Point(2,3));
		list.add(new Point(3,3));
		//remove equals 부름
		list.remove(new Point(1,1));
		printList(list);
		System.out.println(list.indexOf(new Point(3,3)));
	}
	//ArrayList 종료가 여러개기 때문에 그냥 암거나 오라고 Object를 매개변수 같은 곳에는 많이 참조해준다.
	public static void printList(ArrayList<Point> list) {
		for(Object tmp:list) {
			System.out.println(tmp);
		}
	}
}

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	//equals를 오버리딩해야 equals나 indexOf할때 제대로 작동한다... string처럼 미리 만들어진게 아니라 사용자 정의면 !!
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}