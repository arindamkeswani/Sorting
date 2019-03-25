import java.util.Arrays;
public class NewSort {
	int a[]= {4,2,3,1};
	public void selection()
    {
        int n = a.length;
 
        
        for (int i = 0; i < n-1; i++)
        {
            int in = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[in])
                    in = j;
 
            
            int temp = a[in];
            a[in] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
	public static void main(String[] args) {
		NewSort obj2=new NewSort();
		obj2.selection();

	}

}
