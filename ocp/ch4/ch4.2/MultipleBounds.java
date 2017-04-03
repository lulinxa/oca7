interface Wrappable {}
interface Exchangeable {}
class Gift {}
class Parcel <T extends Gift, Exchangeable, Wrappable> {}
