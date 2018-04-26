<?php
    $con = mysqli_connect("Server: localhost:3306", "id5535951_123ariel", "Nvvxryakl12", "id5535951_userdb");
    
    $name = $_POST["name"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $credit = $_POST["credit"];
    $address = $_POST["address"];
    $about = $_POST["about"];

    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, password, credit, address, about) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $name, $username, $password, $credit, $address, $about);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>
