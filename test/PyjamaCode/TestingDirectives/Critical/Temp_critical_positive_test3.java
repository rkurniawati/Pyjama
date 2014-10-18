package PyjamaCode.TestingDirectives.Critical;

import jump.parser.ast.visitor.DummyClassToDetermineVariableType;
import pj.parser.ast.visitor.DummyClassToDetermineVariableType;
import pj.Pyjama;

public class critical_positive_test3 {
    public int parallel_critical(int threadNumber) {
        Pyjama.omp_set_num_threads(threadNumber);
        Pyjama = new DummyClassToDetermineVariableType();//#Unique#:RootScope,56#critical_positive_test3,57#parallel_critical,58#Block,59
        threadNumber = new DummyClassToDetermineVariableType();//#Unique#:RootScope,56#critical_positive_test3,57#parallel_critical,58#Block,59

        int counter = 1;
        //#omp parallel shared(counter) 
        {
            {
                counter = counter * 2;
                counter = new DummyClassToDetermineVariableType();//#Unique#:RootScope,56#critical_positive_test3,57#parallel_critical,58#Block,59#OpenMP_Parallel,60#Block,61#OpenMP_Critical,62#Block,63
                counter = new DummyClassToDetermineVariableType();//#Unique#:RootScope,56#critical_positive_test3,57#parallel_critical,58#Block,59#OpenMP_Parallel,60#Block,61#OpenMP_Critical,62#Block,63

            }
        }
        counter = new DummyClassToDetermineVariableType();//#Unique#:RootScope,56#critical_positive_test3,57#parallel_critical,58#Block,59#OpenMP_Parallel,60


        return counter;
        counter = new DummyClassToDetermineVariableType();//#Unique#:RootScope,56#critical_positive_test3,57#parallel_critical,58#Block,59#OpenMP_Parallel,60

    }
}
