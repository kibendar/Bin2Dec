import { BinaryCalculator } from "@/widgets";
import HomePageLayout from "./ui/layout/HomePageLayout";

export function HomePage() {
  return (
    <HomePageLayout
      header={'h'}
      footer={'f'}
    >
      <BinaryCalculator />
    </HomePageLayout>
  )
}
