import { AuthNavigation } from "@/shared/ui/authNavigation/AuthNavigation";
import { Menu } from "lucide-react";

interface Props {
  className?: string;
}

export default function RightAction({ className }: Props) {
  return (
    <div className={className}>
      <div className="block md:hidden">
        <Menu />
      </div>
      <div className="hidden md:block">
        <AuthNavigation />
      </div>
    </div>
  );
}
