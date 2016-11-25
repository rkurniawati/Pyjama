package PyjamaCode.TestingDirectives.Sections;

public class section_RT{
	public static void main(String[] args){

		int size = 99999999;
		int[] array = new int[size];
		Random random = new Random();                  
        for(int idx = 0 ; idx < size ; ++idx){
            array[idx] = random.nextInt();
        }
        
        System.out.println(isSorted(array,size));
        double startTime = Pyjama.omp_get_wtime();        
        QuickSortOmp(array, size);
		double runTime = Pyjama.omp_get_wtime() - startTime;
		System.out.println(isSorted(array,size));
		System.out.println("Elapsed time "+runTime+"sn");
	}

	 /** The openmp quick sort */
    public static void QuickSortOmp(int[] array, int size){
    	//#omp parallel
    	{
    		//#omp single
    		{
    			QuickSortOmpTask(array, 0, size - 1 , 2);
    		}
    	}
    }

     /** A task dispatcher */
    public static void QuickSortOmpTask(int[] array, int left, int right, int deep){
    	if(left < right){
    		if( deep>1 ){
    			int part = QsPartition(array, left, right);
    			//#omp parallel 
    			{
    				QuickSortOmpTask(array,part + 1,right, deep - 1);
    			}
    			//#omp parallel 
    			{
    				QuickSortOmpTask(array,left,part - 1, deep - 1);
    			}
    		}
    		else {
    			int part = QsPartition(array, left, right);
    			QsSequential(array,part + 1,right);
    			QsSequential(array,left,part - 1);
    		}
    	}
    }
    
    // Swap to value
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int QsPartition(int[] outputArray, int left, int right) {
		int part = right;
		swap(outputArray, part, left + (right - left) / 2);
		int partValue = outputArray[part];
		--right;

		while (true) {
			while (outputArray[left] < partValue) {
				++left;
			}
			while (right >= left && partValue <= outputArray[right]) {
				--right;
			}
			if (right < left)
				break;

			swap(outputArray, left, right);
			++left;
			--right;
		}

`
		swap(outputArray, part, left);

		return left;
	}

	/* a sequential qs */
	public static void QsSequential(int[] array, int left, int right){
		if(left < right){
			int part = QsPartition(array, left, right);
			QsSequential(array,part + 1,right);
			QsSequential(array,left,part - 1);
		}
	}	
}
