package javaStudy.adapter;

public class AdapterImpl implements Adapter{

	 @Override
	    public Float twiceOf(Float f) {
	        return (float) Math.twoTime(f.doubleValue());
	    }

	    @Override
	    public Float halfOf(Float f) {
	        return (float) Math.half(f.doubleValue());
	    }

}
