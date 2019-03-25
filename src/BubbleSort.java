import java.util.Arrays;
public class BubbleSort {
	int a[]= {2,4,3,5,2,1,4,6,5};
	public void bubble() {
		for(int i=0;i<=a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		BubbleSort obj1=new BubbleSort();
		obj1.bubble();

	}

}
