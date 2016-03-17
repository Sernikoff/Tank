package TankClean;

public class BT7 extends AbstractTank {
	
	public BT7(ActionField af, BattleField bf){
		 this(af, bf, 0, 64, Direction.RIGHT);
	}
	
	public BT7(ActionField af, BattleField bf, int x, int y, Direction direction){
		super(af, bf, x, y, direction);
		speed=20;
    }
	
	   public void destroy() throws Exception{
	        updateX(-100);
	        updateY(-100);
	        af.repaint();
	    }
}
