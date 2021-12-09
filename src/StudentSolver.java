import java.util.ArrayList;
import java.util.Collections;
public class StudentSolver {
	
	public static ArrayList<Integer> run(double r, ArrayList<Pair<Pair<Double,Double>, Integer>> mess){
		final int speed = 100;
		double rAngle = Math.toDegrees(Math.atan(r));
		boolean start =false; 
		
		ArrayList<Integer> path =new ArrayList<Integer>();
		ArrayList<Double> yIndexes =new ArrayList<Double>();
		ArrayList<Double> xIndexes =new ArrayList<Double>();
		ArrayList<Double> finalIndexes =new ArrayList<Double>();
		ArrayList<Pair<Double,Double>> indexes =new ArrayList<Pair<Double,Double>>();
		ArrayList<ArrayList<Integer>> paths =new ArrayList<ArrayList<Integer>>();
		
		//Adding the Y indexes for reference 
		for(Pair<Pair<Double,Double>, Integer> i: mess) {
			finalIndexes.add((double)i.first.second);
		}
		//
		for(Pair<Pair<Double,Double>, Integer> i: mess) {
			indexes.add(new Pair(i.first.first,i.first.second));
		}
		for (Pair i : indexes) {
			System.out.println(i);
		}
		
		for(Pair<Pair<Double,Double>, Integer> i: mess) {
			yIndexes.add((double)i.first.second);
			xIndexes.add((double)i.first.first);
		}
		for (int i=0; i<yIndexes.size(); i++) {
			System.out.println("X:"+xIndexes.get(i)+" ,Y:"+yIndexes.get(i));
		}
		
		
		// This is for getting X1,x2,Y1,Y2
		double Y1,Y2 = 0,X1,X2 =0;
		int indexY =0;
		if (start == false) {
			Y1 = Collections.min(yIndexes);
			System.out.println();
			indexY = yIndexes.indexOf(Y1);
			X1 = xIndexes.get(indexY);
			System.out.println("X1 =: "+X1+" Y1 =: "+Y1);
			yIndexes.remove(Y1);
			xIndexes.remove(X1);
			Y2 = Collections.min(yIndexes);
			indexY = yIndexes.indexOf(Y2);
			X2 = xIndexes.get(indexY);
			System.out.println("X2 =: "+X2+" Y2 =: "+Y2);
			yIndexes.remove(Y2);
			xIndexes.remove(X2);
			start = true;
		}
		else {
			Y1 =Y2;
			X1 =X2;
			Y2 = Collections.min(yIndexes);
			indexY = yIndexes.indexOf(Y2);
			yIndexes.remove(Y2);
			xIndexes.remove(X2);
			System.out.println("X1 =: "+X1+" Y1 =: "+Y1);
			System.out.println("X2 =: "+X2+" Y2 =: "+Y2);
			
		}
		
		
		double length = X2-X1;
		double height = Y2-Y1;
		
		double ratio =height/length;
		
		double angle = Math.toDegrees(Math.atan(ratio));
		
		System.out.println(angle);
		System.out.println(rAngle);
		
		if (angle>=rAngle) {
			//Will have to check if this is the first time doing a path
			path.add(finalIndexes.indexOf(Y1));
			path.add(finalIndexes.indexOf(Y2));
		}
		//Loop the code
		
		return path;
	}

	public static void main(String[] args) {
		
		double ratio = 16.7374586913063;
		ArrayList<Pair<Pair<Double,Double>, Integer>> input = new ArrayList<Pair<Pair<Double,Double>, Integer>>();
		
		Pair first = new Pair(50.53339753651755,2392.9913262022305);
		Pair first_I = new Pair(first,4);
		input.add(first_I);
		Pair second = new Pair(91.45350267880721, 2038.5690414517053);
		Pair second_I = new Pair(second,6);
		input.add(second_I);
		Pair thr = new Pair(81.30630354764358, 3002.1564113738523);
		Pair thr_I = new Pair(thr,9);
		input.add(thr_I);
		Pair Frth = new Pair(37.16228801441648, 2421.3261154038723);
		Pair Frth_I = new Pair(Frth,8);
		input.add(Frth_I);
		Pair fifth = new Pair(16.323410763410276, 696.3036909610697);
		Pair fifth_I = new Pair(fifth,1);
		input.add(fifth_I);
		Pair sixth = new Pair(17.558652660436632, 2306.3556734125145);
		Pair sixth_I = new Pair(sixth,1);
		input.add(sixth_I);
		Pair seventh = new Pair(30.858752483887464, 751.748794481916);
		Pair seventh_I = new Pair(seventh,3);
		input.add(seventh_I);
		Pair eigth = new Pair(30.957197204880696, 944.2879593578829);
		Pair eigth_I = new Pair(eigth,8);
		input.add(eigth_I);
		Pair nine = new Pair(15.042626905954554, 2344.979171359295);
		Pair nine_I = new Pair(nine,1);
		input.add(nine_I);
		Pair tenth = new Pair(84.13614550978521, 1310.743768220772);
		Pair tenth_I = new Pair(tenth,9);
		input.add(tenth_I);
		
		for (Pair<Pair<Double,Double>, Integer> a: input)
			System.out.println(a);
		
		System.out.println(run(ratio,input));

	}

}

/*
 * Y1 = Collections.min(yIndexes); System.out.println(); indexY =
 * yIndexes.indexOf(Y1); X1 = xIndexes.get(indexY);
 * System.out.println("X1 =: "+X1+" Y1 =: "+Y1); yIndexes.remove(Y1);
 * xIndexes.remove(X1); Y2 = Collections.min(yIndexes); indexY =
 * yIndexes.indexOf(Y2); X2 = xIndexes.get(indexY);
 * System.out.println("X2 =: "+X2+" Y2 =: "+Y2); yIndexes.remove(Y2);
 * xIndexes.remove(X2);
 */
