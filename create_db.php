<?php
$con = mysqli_connect("fdb19.awardspace.net","2597360_shrey","Shrey@123","2597360_shrey");



$password = $_GET['password'];


   /*$sql="INSERT INTO table1 (Username, Password, Role) VALUES ('$Username', '$Password','$Role')";*/

$sql = "SELECT Username FROM userinfo WHERE Password = '$password'";

$r = mysqli_query($con,$sql);

$result = array();

while($row = mysqli_fetch_array($r)){
    array_push($result,array(
        'username'=>$row['Username']       
    ));
}

echo json_encode(array('result'=>$result));

mysqli_close($con);
   
?>