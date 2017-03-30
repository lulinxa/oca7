class Parcel<T> {}
class GenericBookParcel<T> extends Parcel<T> {}

// this won't compile
// class GenericBookParcel<X> extends Parcel<T> {}

class GenericBookParcel2<X, T> extends Parcel<T> {}
