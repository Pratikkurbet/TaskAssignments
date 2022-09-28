package ObjectAndClassAssignment;

public class Box 
{
	float height;
	float width;
	float depth;

	public Box(float height, float width, float depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
		System.out.println(this.volume(height, width, depth));
	}
	public float volume(float h,float w,float d)
	{
		return h*w*d;
	}
	public static void main(String[] args)
	{
		new Box(10, 10, 10);
	}
}
