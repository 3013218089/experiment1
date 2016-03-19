
public class Triangle {
	 int[] data; 
	 Triangle(){
		 data = new int[3];
	 }
	 public void setData(int[] number){
		 for(int i = 0;i < data.length;i++){
			 data[i] = number[i];
		 }
	 }
     public String checkTriangle(){
    	 for(int i = 0;i < data.length;i++){
    	  if(data[i]<=0)
    		  return "Illegal";
    	 }
    	 if(data[0]+data[1]<=data[2]||data[0]+data[2]<=data[1]||data[1]+data[2]<=data[0]){
    		 return "Not triangle";
    	 }
    	 else if(data[0]==data[1]&&data[0]==data[2]){
    		 return "Equilateral";
    	 }
    	 else if(data[0]==data[1]||data[0]==data[2]||data[1]==data[2]){
    		 return "Isosceles";
    	 }
    	 else
    		 return "Scalene";
     }
}