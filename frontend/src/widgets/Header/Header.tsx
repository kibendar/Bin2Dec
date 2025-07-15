import LeftAction from "./ui/LeftAction";
import RightAction from "./ui/RightAction";

export function Header() {
  return (
    <div className="h-15 flex items-center px-4 bg-white shadow-lg shadow-black-500/50 sticky top-0">
      <div className="container mx-auto flex items-center justify-between">
        <div className="flex items-center gap-5">
          <div>
            <img src="/logo.svg" alt="" />
          </div>
          <div className="hidden md:block">
            <LeftAction />
          </div>
        </div>
        <RightAction />
      </div>
    </div>
  );
}
