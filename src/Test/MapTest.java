package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import Domains.Boolean;
import Domains.Map.Map;

public class MapTest {

	@Test
	public void setGoldTest() {
		Map map = new Map(5,5);
		map.setGold(3, 3, Boolean.TRUE);
		
		assertTrue(map.getPhysicals(3, 3).getGold().isTrue());
	}
	
	@Test
	public void setPitTest() {
		Map map = new Map(5,5);
		map.setPit(3, 3, Boolean.TRUE);
		
		assertTrue(map.getPhysicals(3, 3).getPit().isTrue());
	}
	
	@Test
	public void setWumpusTest() {
		Map map = new Map(5,5);
		map.setWumpus(3, 3, Boolean.TRUE);
		
		assertTrue(map.getPhysicals(3, 3).getWumpus().isTrue());
	}
	
	@Test
	public void glitterTest(){
		Map map = new Map(5,5);
		map.setGold(2, 2, Boolean.TRUE);
		
		assertTrue(map.getSensories(2, 2).getGlitter().isTrue());
	}
	
	@Test
	public void stinkTest1() {
		Map map = new Map(5,5);
		map.setWumpus(3, 3, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 4).getStink().isTrue());
		assertTrue(map.getSensories(4, 3).getStink().isTrue());
		assertTrue(map.getSensories(2, 3).getStink().isTrue());
		assertTrue(map.getSensories(3, 2).getStink().isTrue());
	}
	
	@Test
	public void stinkTest2() {
		Map map = new Map(5,5);
		map.setWumpus(0, 0, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 0).getStink().isTrue());
		assertTrue(map.getSensories(0, 1).getStink().isTrue());
	}
	
	@Test
	public void stinkTest3() {
		Map map = new Map(5,5);
		map.setWumpus(4, 4, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 4).getStink().isTrue());
		assertTrue(map.getSensories(4, 3).getStink().isTrue());
	}
	
	@Test
	public void stinkTest4() {
		Map map = new Map(5,5);
		map.setWumpus(0, 4, Boolean.TRUE);
		
		assertTrue(map.getSensories(0, 3).getStink().isTrue());
		assertTrue(map.getSensories(1, 4).getStink().isTrue());
	}
	
	@Test
	public void stinkTest5() {
		Map map = new Map(5,5);
		map.setWumpus(4, 0, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 0).getStink().isTrue());
		assertTrue(map.getSensories(4, 1).getStink().isTrue());
	}
	
	@Test
	public void stinkTest6() {
		Map map = new Map(5,5);
		map.setWumpus(4, 2, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 2).getStink().isTrue());
		assertTrue(map.getSensories(4, 3).getStink().isTrue());
		assertTrue(map.getSensories(4, 1).getStink().isTrue());
	}
	
	@Test
	public void stinkTest7() {
		Map map = new Map(5,5);
		map.setWumpus(2, 4, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 4).getStink().isTrue());
		assertTrue(map.getSensories(3, 4).getStink().isTrue());
		assertTrue(map.getSensories(2, 3).getStink().isTrue());
	}
	
	@Test
	public void stinkTest8() {
		Map map = new Map(5,5);
		map.setWumpus(0, 2, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 2).getStink().isTrue());
		assertTrue(map.getSensories(0, 3).getStink().isTrue());
		assertTrue(map.getSensories(0, 1).getStink().isTrue());
	}
	
	@Test
	public void stinkTest9() {
		Map map = new Map(5,5);
		map.setWumpus(2, 0, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 0).getStink().isTrue());
		assertTrue(map.getSensories(3, 0).getStink().isTrue());
		assertTrue(map.getSensories(2, 1).getStink().isTrue());
	}
	
	
	@Test
	public void breezeTest1() {
		Map map = new Map(5,5);
		map.setPit(3, 3, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 4).getBreeze().isTrue());
		assertTrue(map.getSensories(4, 3).getBreeze().isTrue());
		assertTrue(map.getSensories(2, 3).getBreeze().isTrue());
		assertTrue(map.getSensories(3, 2).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest2() {
		Map map = new Map(5,5);
		map.setPit(0, 0, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 0).getBreeze().isTrue());
		assertTrue(map.getSensories(0, 1).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest3() {
		Map map = new Map(5,5);
		map.setPit(4, 4, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 4).getBreeze().isTrue());
		assertTrue(map.getSensories(4, 3).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest4() {
		Map map = new Map(5,5);
		map.setPit(0, 4, Boolean.TRUE);
		
		assertTrue(map.getSensories(0, 3).getBreeze().isTrue());
		assertTrue(map.getSensories(1, 4).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest5() {
		Map map = new Map(5,5);
		map.setPit(4, 0, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 0).getBreeze().isTrue());
		assertTrue(map.getSensories(4, 1).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest6() {
		Map map = new Map(5,5);
		map.setPit(4, 2, Boolean.TRUE);
		
		assertTrue(map.getSensories(3, 2).getBreeze().isTrue());
		assertTrue(map.getSensories(4, 3).getBreeze().isTrue());
		assertTrue(map.getSensories(4, 1).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest7() {
		Map map = new Map(5,5);
		map.setPit(2, 4, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 4).getBreeze().isTrue());
		assertTrue(map.getSensories(3, 4).getBreeze().isTrue());
		assertTrue(map.getSensories(2, 3).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest8() {
		Map map = new Map(5,5);
		map.setPit(0, 2, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 2).getBreeze().isTrue());
		assertTrue(map.getSensories(0, 3).getBreeze().isTrue());
		assertTrue(map.getSensories(0, 1).getBreeze().isTrue());
	}
	
	@Test
	public void breezeTest9() {
		Map map = new Map(5,5);
		map.setPit(2, 0, Boolean.TRUE);
		
		assertTrue(map.getSensories(1, 0).getBreeze().isTrue());
		assertTrue(map.getSensories(3, 0).getBreeze().isTrue());
		assertTrue(map.getSensories(2, 1).getBreeze().isTrue());
	}
	
	@Test
	public void neighborsTest1(){
		Map map = new Map(5,5);
		
		assertEquals(map.getNeighbor(2, 2).size(),4);

	}
	
	@Test
	public void neighborsTes2(){
		Map map = new Map(5,5);
		
		assertEquals(map.getNeighbor(0, 0).size(),2);
		assertEquals(map.getNeighbor(4, 4).size(),2);
		assertEquals(map.getNeighbor(0, 4).size(),2);
		assertEquals(map.getNeighbor(4, 0).size(),2);
	}
	
	@Test
	public void neighborsTes3(){
		Map map = new Map(5,5);
		
		assertEquals(map.getNeighbor(0, 2).size(),3);
		assertEquals(map.getNeighbor(2, 0).size(),3);
		assertEquals(map.getNeighbor(2, 4).size(),3);
		assertEquals(map.getNeighbor(4, 2).size(),3);
	}
	
	


}
