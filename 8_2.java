ArrayList<Point> current_path = new ArrayList<Point>();
public static boolean getPaths(int x, int y){
    Point p = new Point(x, y);
    current_path.add(p);
    if (0 == x && 0 == y) return true;
    boolean success = false;
    if (x >= 1 && is_free(x-1,y)){
        success = getPaths(x-1, y);
    }
    if (!success && y >= 1 && is_free(x, y-1)){
        success = getPaths(x, y-1);
    }
    if (!success){
        current_path.remove(p);
    }
    return success;
}



ArrayList<Point> current_path = new ArrayList<Point>();
public static boolean getPaths(int x, int y){
    Point p = new Point(x, y);
    current_path.add(p);
    if (0 == x && 0 == y) return true;
    boolean success = false;
    if (x >= 1 && is_free(x-1, y)){
        success = getPaths(x - 1, y);
    }
    if (!success){
        current_path.remove(p);
    }
    return success;
}
ArrayList allPaths = new ArrayList();
public void PrintAllPossiblePathsWithObstacles(int M, int N,
int[][] obstacles, String path) {
if (obstacles[M][N] == 1)
return;
else if(M == 0 && N == 0)
System.out.println(path);
else {
if(M – 1>=0 )
PrintAllPossiblePathsWithObstacles(M – 1, N, obstacles, “DOWN ” + path);
if(N -1 >=0 )
PrintAllPossiblePathsWithObstacles(M, N – 1, obstacles, “RIGHT ” + path);
}
}


