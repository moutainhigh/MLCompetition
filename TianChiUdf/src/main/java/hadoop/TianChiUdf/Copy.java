package hadoop.TianChiUdf;

import com.aliyun.odps.io.LongWritable;
import com.aliyun.odps.udf.UDF;

/***
 * BASE UDF
 */
public final class Copy extends UDF {
	
	private Long result ;  
	private Long dd ;  
	int tmp[]={9007,3253,1033,3014,1697,2194,37528,1294,7018,3787,228877,458,1304,1670,38693,32777,249,9144,1436,547,28201,1679,7082,18211,10850,296,1559,1362,1278,8058,6339,10055,5943,1608,482,3477,5012,3248,3646,1054,694,22002,900,6224,2599,3007,8926,35353,27392,1923,9968,971,14833,4719,2097,18069,7744,951,1180,2475,6320,21948,25621,5269,344,10445,17809,27523,499,3016,249,2211,26764,1661,3114,29906,1157,4937,451,2572,18362,8057,5119,1134,6875,3033,848,2924,14537,17378,1919,38309,257,3974,9497,910,25303,881,37621,2925};
	  
    public Copy() {  
      result=(long) 0;  
    }  
    /**
     * UDF Evaluate接口
     * 
     * UDF在记录层面上是一对一，字段上是一对一或多对一。 Evaluate方法在每条记录上被调用一次，输入为一个或多个字段，输出为一个字段
     */
    public Long evaluate() {
        // TODO: 请按需要修改参数和返回值，并在这里实现你自己的逻辑
    	result=result + 1;  
    	int t=result.intValue();
    	dd=(long)tmp[t-1];
        return dd; 
    }
}