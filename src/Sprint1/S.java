

//What is the difference between the static and the non-static 
// variables of a class explain it with an example?
//
//=> Static variable
//   1. Static variable initializes with default values at 
//      the time of class loading.
//   2. Belongs to class.
//   3. Can be accessed using ClassName.memberName.
//   
//   Non-static variable
//   1. Non-static variable initializes with default values 
//      at the time of object creation.
//   2. Belongs to object.
//   3. Can be accessed using objectName.memberName.
//
//   
//   Example:
//   For a banking Application:
//  
//   Static variables: bankName, branchName, ifscCode, phone, bankAddress.
//
//   Non-static Variables: (each customer’s) accountNumber, name, phone,
//                         address
// 