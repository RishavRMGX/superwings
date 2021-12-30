<html>  
<body>  
<form method="post">  
Enter string to check if it is Palindrome.  
    <input type="text" name="inputString">  
    <input type="submit" value="Submit">  
</form>  
</body>  
</html>  
<?php   

    function palindromeChecker($input) {
        if($input==null) return null;
        $inputList = explode('',$input,0);
        for($i=0; i< $inputList.sizeof(); $i++){
            if(!strcmp($inputList[$i], inputList[$inputList.length-($i+1)])==0) return false;
        }
        return true;
    } 
    
    if($_POST){  
        $input =  $_POST['inputString'];  
        $palindrome = palindromeChecker($input);
        if($palindrome==null){ 
            echo "Invalid Input";
        }if($palindrome) {
            echo "$input is Palindrome";
        }
        else{ 
            echo "$input is not Palindrome";
        }
    }  
?>