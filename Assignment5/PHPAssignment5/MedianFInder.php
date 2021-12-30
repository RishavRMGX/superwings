<html>  
<body>  
<form method="post">  
Enter array like (1,2,3,4,5) to get median.  
    <input type="text" name="arrayList">  
    <input type="submit" value="Submit">  
</form>  
</body>  
</html>  
<?php   

    function medianFinder($arrayInput, $size) {
        if($arrayInput==null || $size == null) return null;
        sort($arrayInput);
        $position= ceil($size/2);
        return $arrayInput[$position-1];
    } 
    
    if($_POST){  
        $numberArray =  $_POST['arrayList'];  
        $arraytInput = explode(',',$numberArray,0); 
        $median = medianFinder($arraytInput, $arrayInput.sizeof());
        if($evenCheckerResult==null){ 
            echo "Invalid Number";
        }
        else{ 
            echo "$median is median";
        }
    }  
?>