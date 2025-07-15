import { PageHeader } from "@/shared/ui/PageHeader";
import { HomePageLayout } from "./ui/HomePageLayout";
import { ConvertPanel } from "@/features/ConvertPanel";

export function HomePage() {
  return (
    <HomePageLayout
      header={
        <PageHeader
          homeText="Конвертер BIN в DEC"
          homeSubText="Сконвертируйте ваше двоичное число в десятичное"
        />
      }
    >
      <ConvertPanel />
    </HomePageLayout>
  );
}
