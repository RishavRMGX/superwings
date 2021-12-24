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

    function evenChecker($number) {
        if($number==null) return null;
        if(($number % 2) == 0){  
            return true;  
        }
        return false;
    } 
    
    if($_POST){  
        $number = $_POST['number'];   
        $evenCheckerResult = evenChecker($number);
        if($evenCheckerResult==null){ 
            echo "Invalid Number";
        }
        elseif($evenCheckerResult){ 
            echo "$number is even number";
        }
        else{ 
            echo "$number is not even number";
        }
    }  
?>