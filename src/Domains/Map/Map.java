package Domains.Map;

import java.util.ArrayList;

import Domains.Boolean;



public class Map {
	
	private int N;
	private int M;
	private RoomData[][] map;
	
	public Map(int n, int m){
		this(n, m, Boolean.DEFAULT);
	}
	
	public Map(int n, int m, Boolean b){
		
		this.N = n;
		this.M = m;
		this.map = new RoomData[N][M];
		
		for(int i = 0; i < N; i++)
			for(int j = 0; j < M; j++)
				map[i][j] = new RoomData(b);
	}
	
	public Map(ArrayList<Integer[]> data){
		this(data.get(0)[0], data.get(0)[1], Boolean.FALSE);
		
		setGold(data.get(1)[0], data.get(1)[1], Boolean.TRUE);
		setWumpus(data.get(2)[0], data.get(2)[1], Boolean.TRUE);
		
		for(int i = 3; i < data.size(); i++)
			setPit(data.get(i)[0], data.get(i)[1], Boolean.TRUE);
		
	}
	
	public Sensories getSensories(int i, int j){
		return map[i][j].getSensories();
	}
	
	public Physicals getPhysicals(int i, int j){
		return map[i][j].getPhysicals();
	}
	
	public ArrayList<RoomData> getNeighbor(int i, int j){
		ArrayList<RoomData> neighbors = new ArrayList<RoomData>();
		
		if(i!=0)
			neighbors.add(map[i-1][j]);
		
		if(i!=(N-1))
			neighbors.add(map[i+1][j]);
		
		if(j!=0)
			neighbors.add(map[i][j-1]);
		
		if(j!=(M-1))
			neighbors.add(map[i][j+1]);
		
		return neighbors;	
	}
	
	public void setGold(int i, int j, Boolean b){
		map[i][j].getPhysicals().setGold(b);
		
		if(b.isTrue()){
			map[i][j].getSensories().setGlitter(b);
		}
	}
	
	public void setWumpus(int i, int j, Boolean b){
		map[i][j].getPhysicals().setWumpus(b);
		
		if(b.isTrue()){
			for(RoomData x: getNeighbor(i,j))
				x.getSensories().setStink(b);
		}
			
	}
	
	public void setPit(int i, int j, Boolean b){
		map[i][j].getPhysicals().setPit(b);
		
		if(b.isTrue()){
			for(RoomData x: getNeighbor(i,j))
				x.getSensories().setBreeze(b);
		}
	}
}



