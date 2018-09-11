public class ContainerWithWater {
    public int maxArea(int[] height) {

        int start=0,end=height.length-1;
        int maxArea=0;

        while(end>start){
            maxArea=Math.max(maxArea,(end-start)*Math.min(height[start], height[end]));
            if(height[start]<height[end])start++;
            else end--;
        }

        return maxArea;

    }
}
