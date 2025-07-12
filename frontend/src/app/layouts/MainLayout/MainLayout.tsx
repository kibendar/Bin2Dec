import { NavHeader } from "@/shared/ui";
import { Header } from "@/widgets";

interface Props {
  children: React.ReactNode;
}

export default function MainLayout({ children }: Props) {
  return (
    <div className="h-200">
      <NavHeader />
      <Header />
      <main className="container mx-auto py-6">{children}</main>
    </div>
  );
}
