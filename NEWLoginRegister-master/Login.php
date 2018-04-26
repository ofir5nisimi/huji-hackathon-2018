<?php
    $con = mysqli_connect("Server: localhost:3306", "id5535951_123ariel", "Nvvxryakl12", "id5535951_userdb");
    
    $username = $_POST["username"];
    $password = $_POST["password"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM user WHERE username = ? AND password = ?");
    mysqli_stmt_bind_param($statement, "ss", $username, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $user_id, $name, $username, $password, $credit, $address, $about);

    $response = array();
    $response["success"] = false;  
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;  
        $response["name"] = $name;
        $response["username"] = $username;
        $response["password"] = $password;
        $response["credit"] = $credit;
        $response["address"] = $address;
        $response["about"] = $about;
    }
    
    echo json_encode($response);
?>
