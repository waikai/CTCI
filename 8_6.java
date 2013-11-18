boolean PaintFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
    if (x < 0 || x >= screen[0].length || y < 0|| y >= screen.length){
        return false;
    }
    if (screen[y][x] == ocolor){
        screen[y][x] = ncolor;
        PaintFill(screen, x-1, y, ocolor, ncolor);
        PaintFill(screen, x+1, y, ocolor, ncolor);
        PaintFill(screen, x, y-1, ocolor, ncolor);
        PaintFill(screen, x, y+1, ocolor, ncolor);
    }
    return true;
}
boolean PaintFill(Color[][] screen, int x, int y, Color ncolor){
    return PaintFill(Color[][] screen,  x, y, screen[y][x], nocolor);
}
boolean PaintFill(Color[][] screen, int x, int y, Color newcolor){
    return PaintFill(Color[][] screen, int x, int y, Color[y][x], newcolor );
}
boolean PaintFill(Color[][] screen, int x, int y, Color ocolor, Color newcolor){
    if (x <0 || x >= screen[0].length || y < 0|| y >= screen.length)
        return false
    else if (screen[y][x] == ocolor){

