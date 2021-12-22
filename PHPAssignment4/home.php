<html>  
<body>  
<form method="post">  
Please enter total distance traveled. (In Km only):  
    <input type="text" name="number">  
    <input type="submit" value="Submit">  
</form>  
</body>  
</html>  
<?php   
    function fareCounter($distance) {
        $firstFiveKm = 5 * 20;
        $tenKmAfterFirstFive = 10 * 18;
        if($distance==null) return -1;
        if($distance<=0) return -1;
        if($distance <= 2) return 50.0;
        else if($distance <= 5) return $distance * 20;
        else if($distance <= 15) return  $firstFiveKm + ($distance-5) * 18;
        else return $firstFiveKm + $tenKmAfterFirstFive + ($distance - 15) * 15;
    } 
    if($_POST){  
        $input = $_POST['number'];   
        $distance = floatval($input);
        $fare = fareCounter($distance);
        if($fare==null||$fare<0){
            echo "Invalid Distance";
        }  
        else{
            echo "Total Fare for distance $distance Km traveled : $fare Rs";
        } 
    }  
?>  