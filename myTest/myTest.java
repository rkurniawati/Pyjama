public class myTest {

    static int[] a;

    public static void main(String[] args) {
        int result = 0;
        int[] a = parallel_ordered(4);
    }

    public static int[] parallel_ordered(int threadNumber) {
        Pyjama.omp_set_num_threads(threadNumber);
        int[] array = new int[threadNumber];
        int[] counter = new int[1];
        counter[0] = 0;
        //#omp parallel shared(n) private(k) 
        {
            //#omp for private(k) schedule(dynamic,1) 
            for (int _OMP_VANCY_ITERATOR_ = 0; _OMP_VANCY_ITERATOR_ < 3; ++_OMP_VANCY_ITERATOR_) switch(_OMP_VANCY_ITERATOR_) {
                case 0:
                    System.out.println("dfdddddddddd");
                    break;
                case 1:
                    {
                        System.out.println("dfd");
                    }
                    break;
                case 2:
                    {
                        System.out.println("dfd");
                        System.out.println("dfd");
                    }
                    break;
            }
        }
        {
            System.out.println("dfd");
        }
        System.out.println("dfd");
        return array;
    }
}
