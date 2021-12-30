<html>  
<body>  
<form method="post">  
    Enter a number:  
    <input type="number" name="number">  
    <input type="submit" value="Submit">  
</form>  
</body>  
</html>  
<?php   

    function leapYearChecker($year) {
        if($year==null) return null;
        if(($year % 4) == 0){  
            if(($year % 100) == 0){
                if(($year % 400) == 0){
                    return true;
                }
                return false;
            }
            return true;  
        }
        return false;
    } 
    
    if($_POST){  
        $year = $_POST['number'];   
        $leapYearCheckerResult = leapYearChecker($year);
        if($leapYearCheckerResult==null){ 
            echo "Invalid Number";
        }
        elseif($leapYearCheckerResult){ 
            echo "$year is a leap year";
        }
        else{ 
            echo "$year is not a leap year";
        }
    }  
?>  