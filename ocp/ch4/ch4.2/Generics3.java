class Phone {}
class Parcel<T> {}
class NonGenericPhoneParcel extends Parcel<Phone> {}

// NonGenericPhoneParcel<String> var = new NonGenericPhoneParcel<>() ->won't compile

// generic class with multiple type parameters
//class ClassName<T1, T2, ..., Tn> { /* code */ } 
